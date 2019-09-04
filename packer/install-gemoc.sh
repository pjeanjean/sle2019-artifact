sudo apk update

# Remove unneeded copied files
rm -rf /home/packer/sle2019-artifact/packer

# Install XFCE4
echo http://dl-cdn.alpinelinux.org/alpine/v3.10/community | sudo tee -a /etc/apk/repositories
sudo apk add virtualbox-guest-additions
sudo apk add virtualbox-guest-additions-x11
sudo apk add xf86-video-vesa
sudo setup-xorg-base xfce4 xfce4-terminal adwaita-icon-theme

# Auto login
sudo apk add util-linux
sudo sed 's+^\(tty1[^/]*\)/sbin/getty\(.*\)$+\1/sbin/agetty -a packer\2+' -i /etc/inittab

# Auto-start X after login
echo "startx" > /home/packer/.profile

# Install JDK9
sudo apk add openjdk9-jdk

# Install Gemoc Studio
sudo apk add curl
curl http://download.eclipse.org/gemoc/packages/releases/3.1.0/gemoc_studio-linux.gtk.x86_64.zip -o /tmp/gemoc.zip
mkdir /home/packer/gemoc
unzip /tmp/gemoc.zip -d /home/packer/gemoc/
rm /tmp/gemoc.zip

# Auto start Gemoc Studio
mkdir -p /home/packer/.config/autostart
echo -e "[Desktop Entry]\nEncoding=UTF-8\nName=GemocStudio\nExec=/home/packer/gemoc/GemocStudio\nTerminal=false\nType=Application" > /home/packer/.config/autostart/gemocstudio.desktop

# Install fix from artifact
cp -r sle2019-artifact/xtext-fix/plugins gemoc
