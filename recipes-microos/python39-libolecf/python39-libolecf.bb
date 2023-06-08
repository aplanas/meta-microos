SUMMARY = "Library and tools to access the OLE 2 Compound File (OLECF) format"
DESCRIPTION = "Library and tools to access the OLE 2 Compound File (OLECF) format. \
The OLE 2 Compound File format is used to store certain versions of \
Microsoft Office files, thumbs.db and other file formats."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python39-libolecf-20221024-3.5.aarch64.rpm"
RPM_HASH = "84a3b6a924802163141ac7ee68dc6f4a207dd31a9c47298ebb5818d79119d0b4643e8d48161bdcd937d69bb91a89286629a79ed5170550d365b078c27d185864"

RPROVIDES:${PN} += "python39-libolecf python39-libolecf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libolecf.so.1()(64bit) libolecf.so.1(V_20221024)(64bit) python(abi)"

inherit rpm
