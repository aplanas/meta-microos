SUMMARY = "RPM macros for building Rust source packages"
DESCRIPTION = "This package provides the RPM macros for building usable Source RPMs \
of Rust packages."
LICENSE = "MIT"

PV = "15"

RPM_NAME = "rust-srpm-macros-15-2.16.noarch.rpm"
RPM_HASH = "7ce30f0bd2e153d6fbde28fdcf5b7f37de0df3dc0bca552a6fb618ac91afdd36178cddf456bf90ef76294ba7e4e81798c81ea24fc0149c7cacb16a71f19a3aa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm_macro(crates_source) rpm_macro(rust_arches) rpm_macro(version_no_tilde) rust-srpm-macros"
RDEPENDS:${PN} += ""

inherit rpm
