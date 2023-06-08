SUMMARY = "Reactive Extensions"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Microsoft's Reactive Extensions."
LICENSE = "Apache-2.0"

PV = "6.12.0"

RPM_NAME = "mono-reactive-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "26d69cc941f7b972841be8eab0e082ec87e53074ae39b5eb335671773800a6f2d45da612682a824e41f25753fedfd0777a8105efcb4e2d9ea6f3a5415be04e4b"

RPROVIDES:${PN} += "mono(System.Reactive.Core) mono(System.Reactive.Debugger) mono(System.Reactive.Experimental) mono(System.Reactive.Interfaces) mono(System.Reactive.Linq) mono(System.Reactive.Observable.Aliases) mono(System.Reactive.PlatformServices) mono(System.Reactive.Providers) mono(System.Reactive.Runtime.Remoting) mono(System.Reactive.Windows.Forms) mono(System.Reactive.Windows.Threading) mono-reactive mono-reactive(aarch-64) pkgconfig(reactive)"
RDEPENDS:${PN} += "/usr/bin/pkg-config mono(System) mono(System.Core) mono(System.Windows.Forms) mono(WindowsBase) mono(mscorlib) mono-core"

inherit rpm
