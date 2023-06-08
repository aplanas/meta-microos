SUMMARY = "An OBS source service: Download, verify and vendor Rust crates (libraries)"
DESCRIPTION = "An OBS Source Service that will download, \
verify and vendor Rust crates (libraries)"
LICENSE = "GPL-2.0-or-later"

PV = "0.4.5~0"

RPM_NAME = "obs-service-cargo_vendor-0.4.5~0-1.1.noarch.rpm"
RPM_HASH = "88f6aba6304bf44f6b4a2310882f65d9556e30692fad663a70f69f73d362ab312caa99b740c237cb93b6a8cde39ab523d480b2038d5502039e009b3487dc5aec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-cargo_vendor"
RDEPENDS:${PN} += "(cargo or rustup) /usr/bin/python3 gzip python3 python3-zstandard tar zstd"

inherit rpm
