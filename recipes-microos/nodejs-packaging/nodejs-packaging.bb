SUMMARY = "Node.js Dependency generators for openSUSE"
DESCRIPTION = "This package generates Node.js Provides/Requires dependencies \
automatically for nodejs module packages in openSUSE."
LICENSE = "MIT"

PV = "10.beta11"

RPM_NAME = "nodejs-packaging-10.beta11-4.2.noarch.rpm"
RPM_HASH = "a3ab44bea35feba8028e3cb54251ac6c778604abd99eb1e5c884d154969decf026033dc8b05a360343aecdeb4f7ca8794adf606502c357dbf161c6e704495ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs-packaging rpm_macro(nodejs_build) rpm_macro(nodejs_check) rpm_macro(nodejs_clean) rpm_macro(nodejs_copy) rpm_macro(nodejs_default_filter) rpm_macro(nodejs_filelist) rpm_macro(nodejs_find_provides_and_requires) rpm_macro(nodejs_fixdep) rpm_macro(nodejs_install) rpm_macro(nodejs_mkdir) rpm_macro(nodejs_modulesdir) rpm_macro(nodejs_prep) rpm_macro(nodejs_sitearch) rpm_macro(nodejs_sitelib) rpm_macro(nodejs_symlink_deps) rpm_macro(nodejs_version)"
RDEPENDS:${PN} += "/usr/bin/env /usr/bin/ruby gcc-c++ nodejs-devel npm ruby rubygem(json)"

inherit rpm
