git clone git@github.com:KolibriKing/Linux.java.git
if [ ! -d ~/Linux.java ]; then
  mv Linux.java ~
fi
export LINUXJAVA_INSTALL_DIR=/home/$USER/Linux.java
export PATH=/home/$USER/Linux.java/cmd:$PATH

touch $LINUXJAVA_INSTALL_DIR/Main.log
