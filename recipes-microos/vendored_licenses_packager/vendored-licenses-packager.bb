SUMMARY = "Script to package legal files of vendored sources"
DESCRIPTION = "This bash script with RPM macros may help packagers to include \
some legal files of vendored dependencies."
LICENSE = "EUPL-1.2"

PV = "0.1.0"

RPM_NAME = "vendored_licenses_packager-0.1.0-1.5.noarch.rpm"
RPM_HASH = "9ad22e188a32993eb1ef4656415751665626fc70c6e9595efa274a6f924073dc7f95de39f2f8eabfc1387f57fec3627322113052aea4d0446f857ce244e9ac96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm_macro(_set_dir_vendored_source_global) rpm_macro(_set_dir_vendored_sources) rpm_macro(_set_dir_vendored_target) rpm_macro(_set_dir_vendored_target_global) rpm_macro(_set_global_vendor_source_dir) rpm_macro(_set_global_vendor_target_dir) rpm_macro(_set_tmp_licenses_vendored_dir) rpm_macro(_tmp_licenses_dir) rpm_macro(set_dir_vendored_source) rpm_macro(set_dir_vendored_target) rpm_macro(vendored_licenses_packager_files) rpm_macro(vendored_licenses_packager_files_with_higher_dirs) rpm_macro(vendored_licenses_packager_install) rpm_macro(vendored_licenses_packager_prep) vendored_licenses_packager"
RDEPENDS:${PN} += "/bin/bash bash coreutils findutils"

inherit rpm
