SUMMARY = "A mode switching tool for controlling multiple-device USB gear"
DESCRIPTION = "USB_ModeSwitch is a mode switching tool for controlling 'flip flop' \
(multiple device) USB gear. It allows so-called 'Zero-CD' devices that \
show up as USB storage initially to be switched into their more useful \
'application mode'. This is most common for UMTS/3G wireless WAN \
devices."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.1"

RPM_NAME = "usb_modeswitch-2.6.1-2.6.aarch64.rpm"
RPM_HASH = "22a0f9d7546e6c63e3d9446ffee4a376b90d03f5866c7de09abe6a0977a9e7c7a3e6ffa11ac5fbb827de53e4432b93d91441ea2eba5e692babd0ae82f9b937ad"

RPROVIDES:${PN} += "config(usb_modeswitch) usb_modeswitch usb_modeswitch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/tclsh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libusb-1.0.so.0()(64bit) systemd tcl usb_modeswitch-data"

inherit rpm
