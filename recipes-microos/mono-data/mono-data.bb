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

RPM_NAME = "mono-data-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "13521378f9c40c7febf262bd7905e940a57bb014bf3a3658b16ca0e450c95616f701deb4c0c7c06b217fd76aaa9c7a00966cf129c2c45f401f2b893aae6ee852"

RPROVIDES:${PN} += "mono(Mono.Data.Tds) mono(Novell.Directory.Ldap) mono(System.Data) mono(System.Data.DataSetExtensions) mono(System.Data.Entity) mono(System.Data.Linq) mono(System.DirectoryServices) mono(System.DirectoryServices.Protocols) mono(System.EnterpriseServices) mono(System.Runtime.Serialization) mono(System.Transactions) mono(WebMatrix.Data) mono(sqlmetal) mono(sqlsharp) mono-data mono-data(aarch-64) mono-directory mono-ms-enterprise mono-novell-directory"
RDEPENDS:${PN} += "/bin/sh mono(Mono.Security) mono(System) mono(System.ComponentModel.DataAnnotations) mono(System.Configuration) mono(System.Core) mono(System.Numerics) mono(System.ServiceModel.Internals) mono(System.Xml) mono(System.Xml.Linq) mono(mscorlib) mono-core"

inherit rpm
