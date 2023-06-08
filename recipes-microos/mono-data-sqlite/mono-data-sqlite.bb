SUMMARY = "Database connectivity for Mono"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Database connectivity for Mono."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-data-sqlite-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "882fb3be8994d8d8e460c38e2dc7bd854d93b2b29b893cf9b74abc9176be70eae34b8372a319ebc84044e42f62560ccb1f172c8498364853eab316d7ec84ef33"

RPROVIDES:${PN} += "mono(Mono.Data.Sqlite) mono-data-sqlite mono-data-sqlite(aarch-64)"
RDEPENDS:${PN} += "mono(System) mono(System.Data) mono(System.Transactions) mono(mscorlib) mono-core mono-data"

inherit rpm
