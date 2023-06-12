SUMMARY = "An example tools to forward localhost ports to iOS devices"
DESCRIPTION = "'usbmuxd' stands for 'USB multiplexing daemon'. This daemon is in charge of \
multiplexing connections over USB to an iPhone or iPod touch. To users, it means \
you can sync your music, contacts, photos, etc. over USB. To developers, it \
means you can connect to any listening localhost socket on the device. usbmuxd \
is not used for tethering data transfer, which uses a dedicated USB interface as \
a virtual network device. \
 \
Multiple connections to different TCP ports can happen in parallel. An example \
(and useful) tool called 'iproxy' is included that allows you to forward \
localhost ports to the device---allows SSH over USB on jailbroken devices, or \
allowing access the lockdown daemon (and then to all of the file access, sync, \
notification and backup services running on the device)."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.0.2"

RPM_NAME = "libusbmuxd-tools-2.0.2-1.9.aarch64.rpm"
RPM_HASH = "4ac2322d57af96b1929c78cfb99585aa03cab2beed17d58622ca43d9e822e58a04cbeaea6e7c35faf6464c481f3b40cbe791779dbd331ad5a2f638e7b93a3599"

RPROVIDES:${PN} += "iproxy \
libusbmuxd-tools \
libusbmuxd-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libusbmuxd-2.0.so.6()(64bit)"

inherit rpm
