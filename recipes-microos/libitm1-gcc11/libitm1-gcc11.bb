SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "11.3.1+git2076"

RPM_NAME = "libitm1-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "33881c079ff09e459340d8850bbdd6b3827868b942423b8ee44f4c4eaa34c4a12680fb8dffeb49fba461136e0ce760058a2bd16fc107b9883ce65c3a61623de4"

RPROVIDES:${PN} += "libitm.so.1()(64bit) libitm.so.1(LIBITM_1.0)(64bit) libitm.so.1(LIBITM_1.1)(64bit) libitm1 libitm1-gcc11 libitm1-gcc11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
