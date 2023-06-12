SUMMARY = "An OBS source service: Download, verify and vendor Rust crates (libraries)"
DESCRIPTION = "An OBS Source Service that will download, \
verify and vendor Rust crates (libraries)"
LICENSE = "GPL-2.0-or-later"

PV = "0.4.5~1"

RPM_NAME = "obs-service-cargo_vendor-0.4.5~1-1.1.noarch.rpm"
RPM_HASH = "51c5804175e598b43348e153b690a4abeeb0282ac4671250d217a53d6037752bc709463fb8a6abbd21f597d2ae435c778fcc908e3b258667f4cd23c56170ecd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-cargo_vendor"
RDEPENDS:${PN} += "(cargo or rustup) /usr/bin/python3 gzip python3 python3-zstandard tar zstd"

inherit rpm
