SUMMARY = "Install everything built from the mono source tree"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Install everything built from the mono source tree.  Note that this does \
not install anything from outside the mono source (XSP, mono-basic, etc.)."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-complete-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "8ab18ca071589bb34d47c97f500f3a7c0c074f743e8df2dbc46c773d60956e31cb6dac9c61c63c952000eb51a7b3c51028f707e56af84f8d9e35b8c12b4a3648"

RPROVIDES:${PN} += "mono-complete mono-complete(aarch-64)"
RDEPENDS:${PN} += "ibm-data-db2 libmono-2_0-1 libmono-2_0-devel libmonosgen-2_0-1 libmonosgen-2_0-devel mono-core mono-data mono-data-oracle mono-data-sqlite mono-devel mono-extras mono-locale-extras mono-mvc mono-reactive mono-wcf mono-web mono-winforms mono-winfxcore monodoc-core"

inherit rpm
