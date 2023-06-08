SUMMARY = "Hmland and utilities to use the HM-CFG-USB(2)"
DESCRIPTION = "This package contains, amongst others, hmland an application, which emulates the \
HomeMatic LAN configuration adapter-protocol to make it possible to use the \
HM-CFG-USB in Fhem or as a lan configuration tool for the CCU or the \
HomeMatic windows configuration software, also supporting devices using \
AES-signing like KeyMatic."
LICENSE = "MIT & SUSE-Public-Domain"

PV = "0.103+git23.g7157286"

RPM_NAME = "hmcfgusb-0.103+git23.g7157286-1.2.aarch64.rpm"
RPM_HASH = "5f3b817b4a71f3fa2c0b6037ac32fa4c0db9d99e4046f7a0dc29e5ada339717c5868e69ceff40703a6dcea5cdc87714daccb7737603e99cf94739bbf964c3326"

RPROVIDES:${PN} += "config(hmcfgusb) hmcfgusb hmcfgusb(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup libc.so.6(GLIBC_2.34)(64bit) libusb-1.0.so.0()(64bit) logrotate"

inherit rpm
