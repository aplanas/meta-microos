SUMMARY = "Common RPM macros for zig"
DESCRIPTION = "This package contains common RPM macros for zig."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "zig-rpm-macros-0.10.1-2.3.noarch.rpm"
RPM_HASH = "3d6b3b3edc0b3fe24e25430edcd2ec28f432223ee5f64b804f7fd4909138d79beae159d7cf7ae0859d89c72f5b8dc78a64167045b6743b237663cb7b6a47f31f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm_macro(_zig_advanced_options) rpm_macro(_zig_build_options) rpm_macro(_zig_cpu) rpm_macro(_zig_general_options) rpm_macro(_zig_install_options) rpm_macro(_zig_project_options) rpm_macro(_zig_target) rpm_macro(_zig_version) rpm_macro(zig) rpm_macro(zig_arches) rpm_macro(zig_build) rpm_macro(zig_install) rpm_macro(zig_test) zig-rpm-macros"
RDEPENDS:${PN} += "rpm"

inherit rpm
