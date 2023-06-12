SUMMARY = "Decode uu/xx/b64/mime/yenc/etc-encoded data from a massive number of files"
DESCRIPTION = "This module started as an interface to the uulib/uudeview library by Frank \
Pilhofer that can be used to decode all kinds of usenet (and other) binary \
messages. \
 \
After upstream abondoned the project, th library was continuously bugfixed \
and improved in this module, with major focuses on security fixes, \
correctness and speed (that does not mean that this library is considered \
safe with untrusted data, but it surely is safer than the poriginal \
uudeview). \
 \
Read the file doc/library.pdf from the distribution for in-depth \
information about the C-library used in this interface, and the rest of \
this document and especially the non-trivial decoder program at the end."
LICENSE = "GPL-1.0-or-later"

PV = "1.8"

RPM_NAME = "perl-Convert-UUlib-1.8-1.14.aarch64.rpm"
RPM_HASH = "8dbabf391559141a29b016ac52bf94a7ed258429de7e40afee1d593a826d69d9ef6ce91f0706d6d5fe04a769d6dd8705e351495b04ff90df2b4a7cb50d8f6414"

RPROVIDES:${PN} += "p_conulb \
perl(Convert::UUlib) \
perl-Convert-UUlib \
perl-Convert-UUlib(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(common::sense)"

inherit rpm
