SUMMARY = "KIWI - Collection of Boot Helper Tools"
DESCRIPTION = "This package contains a small set of helper tools used for the \
kiwi created initial ramdisk which is used to control the very \
first boot of an appliance. The tools are not meant to be used \
outside of the scope of kiwi appliance building."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "kiwi-tools-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "4756cce058541a750ed758d054425ca94600b9fdb16bc928de829141ad89cfa242afe8df0d6ca12670cc86571570e89931e6ee3902a5b73596d1fdff62171d28"

RPROVIDES:${PN} += "kiwi-tools kiwi-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
