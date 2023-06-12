SUMMARY = "Mono Addins Framework"
DESCRIPTION = "Mono.Addins is a generic framework for creating extensible \
applications, and for creating libraries which extend those \
applications."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "mono-addins-1.3.3-2.16.noarch.rpm"
RPM_HASH = "3fa9d050c2482d433bd9279b25099462a4721ca950b9b4afcc868f0702b33dae2e2c6d88aaadd267caba252bcdf0a45bc0e22338d3d831988027af25a4afdaea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono(Mono.Addins) \
mono(Mono.Addins.CecilReflector) \
mono(Mono.Addins.Gui) \
mono(Mono.Addins.Setup) \
mono(mautil) \
mono(policy.0.2.Mono.Addins) \
mono(policy.0.2.Mono.Addins.CecilReflector) \
mono(policy.0.2.Mono.Addins.Gui) \
mono(policy.0.2.Mono.Addins.Setup) \
mono(policy.0.3.Mono.Addins) \
mono(policy.0.3.Mono.Addins.CecilReflector) \
mono(policy.0.3.Mono.Addins.Gui) \
mono(policy.0.3.Mono.Addins.Setup) \
mono(policy.0.4.Mono.Addins) \
mono(policy.0.4.Mono.Addins.CecilReflector) \
mono(policy.0.4.Mono.Addins.Gui) \
mono(policy.0.4.Mono.Addins.Setup) \
mono(policy.0.5.Mono.Addins) \
mono(policy.0.5.Mono.Addins.CecilReflector) \
mono(policy.0.5.Mono.Addins.Gui) \
mono(policy.0.5.Mono.Addins.Setup) \
mono(policy.0.6.Mono.Addins) \
mono(policy.0.6.Mono.Addins.CecilReflector) \
mono(policy.0.6.Mono.Addins.Gui) \
mono(policy.0.6.Mono.Addins.Setup) \
mono-addins"
RDEPENDS:${PN} += "/bin/sh \
mono(ICSharpCode.SharpZipLib) \
mono(Mono.Cairo) \
mono(Mono.Posix) \
mono(System) \
mono(System.Core) \
mono(System.Xml) \
mono(gdk-sharp) \
mono(glib-sharp) \
mono(gtk-sharp) \
mono(mscorlib) \
mono(pango-sharp)"

inherit rpm
