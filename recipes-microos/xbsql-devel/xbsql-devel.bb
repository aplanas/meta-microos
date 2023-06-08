SUMMARY = "Files for developing with xbsql"
DESCRIPTION = "XBase DBMS is a C++ library that supports access to XBase type data \
files and indexes (.dbf and related files, for example). It provides \
record level access to these files. \
 \
This package contains development files"
LICENSE = "LGPL-2.1-or-later"

PV = "0.11"

RPM_NAME = "xbsql-devel-0.11-260.8.aarch64.rpm"
RPM_HASH = "4d71cf7b27c4610f52281d738c56364597e0312efca7548e7a182289a64f097349d58f118741662f731ac4458184f94c072c8ab2f97c0a5a74d2831c7f01b34a"

RPROVIDES:${PN} += "xbsql-devel xbsql-devel(aarch-64)"
RDEPENDS:${PN} += "libxbsql0"

inherit rpm
