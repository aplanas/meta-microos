SUMMARY = "Java packages filesystem layout"
DESCRIPTION = "This package provides some basic directories into which Java packages \
install their content."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "javapackages-filesystem-6.1.0-2.2.aarch64.rpm"
RPM_HASH = "bac46f1f17978d2dbc5093095d0ea9f61f5393745b9ae482c846b29455a7282e22a3467061e1bef683a813e92940b8cdf8b4556d65666c0d62f2dca97ae1ddf9"

RPROVIDES:${PN} += "javapackages-filesystem javapackages-filesystem(aarch-64) rpm_macro(_ivyxmldir) rpm_macro(_javaconfdir) rpm_macro(_javadir) rpm_macro(_javadocdir) rpm_macro(_jnidir) rpm_macro(_jvmcommondatadir) rpm_macro(_jvmcommonlibdir) rpm_macro(_jvmcommonsysconfdir) rpm_macro(_jvmdatadir) rpm_macro(_jvmdir) rpm_macro(_jvmlibdir) rpm_macro(_jvmprivdir) rpm_macro(_jvmsysconfdir) rpm_macro(_mavenpomdir)"
RDEPENDS:${PN} += ""

inherit rpm
