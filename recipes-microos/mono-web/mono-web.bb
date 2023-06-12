SUMMARY = "Mono implementation of ASP"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Mono implementation of ASP.NET, Remoting and Web Services."
LICENSE = "MIT & MS-PL"

PV = "6.12.0"

RPM_NAME = "mono-web-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "c89a542af7180ba4d9c1868925c3015debeee5ad5c671563465f8a472f671c5a3dc5eec3fe28b1054b7d1c5a5d1ff2aa8ec3257851dd3e34010de6a2c6de2c08"

RPROVIDES:${PN} += "config(mono-web) \
mono(Microsoft.Web.Infrastructure) \
mono(Mono.Http) \
mono(System.ComponentModel.Composition) \
mono(System.ComponentModel.DataAnnotations) \
mono(System.Runtime.Remoting) \
mono(System.Runtime.Serialization.Formatters.Soap) \
mono(System.Web) \
mono(System.Web.Abstractions) \
mono(System.Web.ApplicationServices) \
mono(System.Web.Http) \
mono(System.Web.Http.SelfHost) \
mono(System.Web.Http.WebHost) \
mono(System.Web.Razor) \
mono(System.Web.Routing) \
mono(System.Web.Services) \
mono(System.Web.WebPages) \
mono(System.Web.WebPages.Deployment) \
mono(System.Web.WebPages.Razor) \
mono(disco) \
mono(mconfig) \
mono(soapsuds) \
mono(wsdl) \
mono(xsd) \
mono-remoting \
mono-web \
mono-web(aarch-64) \
mono-web-forms \
mono-web-services \
pkgconfig(aspnetwebstack)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
mono(ICSharpCode.SharpZipLib) \
mono(Microsoft.CSharp) \
mono(Mono.Data.Sqlite) \
mono(Mono.Security) \
mono(System) \
mono(System.Configuration) \
mono(System.Core) \
mono(System.Data) \
mono(System.Data.Linq) \
mono(System.Design) \
mono(System.DirectoryServices) \
mono(System.Drawing) \
mono(System.EnterpriseServices) \
mono(System.IdentityModel) \
mono(System.Net.Http) \
mono(System.Net.Http.Formatting) \
mono(System.Runtime.Serialization) \
mono(System.ServiceModel) \
mono(System.Xml) \
mono(System.Xml.Linq) \
mono(mscorlib) \
mono-core"

inherit rpm
