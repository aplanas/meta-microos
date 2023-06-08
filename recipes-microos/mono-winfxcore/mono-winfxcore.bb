SUMMARY = "Mono implementation of core WinFX APIs"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Mono implementation of core WinFX APIs"
LICENSE = "MIT & MS-PL"

PV = "6.12.0"

RPM_NAME = "mono-winfxcore-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "8ee356da1110283b96ecf89838ac8d2d41ef0c6d65378f132e5a4094f5e899330d6fd4c7481d1ca388744c1cfd9352e238a769c5f76127df47b453fa0b072b5c"

RPROVIDES:${PN} += "mono(WindowsBase) mono-winfxcore mono-winfxcore(aarch-64)"
RDEPENDS:${PN} += "mono(System) mono(System.Xaml) mono(System.Xml) mono(mscorlib) mono-core"

inherit rpm
