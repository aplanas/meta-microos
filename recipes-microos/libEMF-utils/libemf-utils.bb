SUMMARY = "Library for manipulation with Enhanced MetaFile (EMF, ECMA-234)"
DESCRIPTION = "LibEMF is a C/C++ library which provides a drawing toolkit based on \
ECMA-234. The general purpose of this library is to create vector \
graphics files on POSIX systems which can be imported into \
StarOffice/OpenOffice. The Enhanced MetaFile (EMF) is one of the two \
color vector graphics format which is 'vectorially' understood by \
SO/OO. The EMF format also has the additional advantage that it can be \
'broken' into its constituent components and edited like any other \
SO/OO graphics object."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.13"

RPM_NAME = "libEMF-utils-1.0.13-3.3.aarch64.rpm"
RPM_HASH = "ddd5946fda8b51e3c0de3be9ef1f26172721ff4358bc8f31b6a9441db41183d7a3ab2bac8c4d9c947b8963365cb12fe68b4fed0d4632b0435fa401d909644a32"

RPROVIDES:${PN} += "libEMF-utils libEMF-utils(aarch-64) libEMF:/usr/bin/printemf"
RDEPENDS:${PN} += "libEMF.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
