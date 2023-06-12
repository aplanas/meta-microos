SUMMARY = "Implementation of rep, a lisp dialect - Libraries"
DESCRIPTION = "Librep is a shared library implementing a Lisp dialect that is \
lightweight, reasonably fast, and highly extensible. It contains an \
interpreter, byte-code compiler and virtual machine. Applications may \
use the interpreter as an extension language, or it may be used for \
standalone scripts. \
 \
Rep was originally inspired by Emacs Lisp. However one of the main \
deficiencies of elisp -- the reliance on dynamic scope -- has been \
removed. Also, rep only has a single namespace for symbols."
LICENSE = "GPL-2.0-or-later"

PV = "0.92.7"

RPM_NAME = "librep16-0.92.7-1.26.aarch64.rpm"
RPM_HASH = "02ab5df62e3492780e75dd2b63a2e547afa7eb1876b063b5ee694d2983c035c3d7541e4f4e1f49f763316c0c538db6b0fcf9da9ebdaeacac76d9cba09311fc2e"

RPROVIDES:${PN} += "librep.so.16()(64bit) \
librep16 \
librep16(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
