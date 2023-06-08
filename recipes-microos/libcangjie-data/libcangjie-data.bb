SUMMARY = "Data files for the libcangjie IME"
DESCRIPTION = "libcangjie is a C library implementing the Cangjie input method, \
which is mainly used on Traditional Chinese inputing. \
 \
libcangjie-data contains the input mapping table to switch en_US \
keyboard codes to Traditional Chinese characters, and it is designed \
to be compiled into the final input engine 'ibus-cangjie'."
LICENSE = "LGPL-3.0+"

PV = "1.3"

RPM_NAME = "libcangjie-data-1.3-1.20.noarch.rpm"
RPM_HASH = "f3558bbb36c947a953947d91f472be815aefb2d78c221f6ec3519d34f1f9f4c2b854ccdcaa15b2a38dbcb0560ba67fbc7947f9e24cf7ffcd686da6ec93fe56be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcangjie-data"
RDEPENDS:${PN} += "libcangjie2"

inherit rpm
