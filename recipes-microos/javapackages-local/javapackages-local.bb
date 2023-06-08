SUMMARY = "Non-essential macros and scripts for Java packaging support"
DESCRIPTION = "This package provides non-essential macros and scripts to support Java packaging."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "javapackages-local-6.1.0-2.3.noarch.rpm"
RPM_HASH = "35968afd1015c1ae168869ba02906b665825448b53591accd315b503427fb691d48365b21db53530d172283d1f0c389778dd0dc41b9dbb106740f218046c0628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(javapackages-local) javapackages-local rpm_macro(add_maven_depmap) rpm_macro(gradle_build) rpm_macro(java_remove_annotations) rpm_macro(java_remove_imports) rpm_macro(javadoc_package) rpm_macro(mvn_alias) rpm_macro(mvn_artifact) rpm_macro(mvn_build) rpm_macro(mvn_compat_version) rpm_macro(mvn_config) rpm_macro(mvn_file) rpm_macro(mvn_install) rpm_macro(mvn_install_pom) rpm_macro(mvn_package) rpm_macro(mvn_subst) rpm_macro(pom_add_dep) rpm_macro(pom_add_dep_mgmt) rpm_macro(pom_add_parent) rpm_macro(pom_add_plugin) rpm_macro(pom_change_dep) rpm_macro(pom_disable_module) rpm_macro(pom_remove_dep) rpm_macro(pom_remove_parent) rpm_macro(pom_remove_plugin) rpm_macro(pom_set_parent) rpm_macro(pom_xpath_disable) rpm_macro(pom_xpath_inject) rpm_macro(pom_xpath_remove) rpm_macro(pom_xpath_replace) rpm_macro(pom_xpath_set)"
RDEPENDS:${PN} += "java-devel javapackages-tools python3-javapackages"

inherit rpm
