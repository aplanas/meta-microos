SUMMARY = "A library providing Unicode character names and annotations"
DESCRIPTION = "libuninameslist provides Unicode name and annotation data from the official Unicode Character Database."
LICENSE = "BSD-3-Clause"

PV = "20221022"

RPM_NAME = "libuninameslist1-20221022-1.2.aarch64.rpm"
RPM_HASH = "d1f512540e1d0c4566abc3425840a3135b782e8f78d2631906a5985bde6b33141653e5694aebfbf8288a7237892efc29fcbd02564b5c8a5ebe9504f9b3a03b13"

RPROVIDES:${PN} += "libuninameslist.so.1()(64bit) libuninameslist1 libuninameslist1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
