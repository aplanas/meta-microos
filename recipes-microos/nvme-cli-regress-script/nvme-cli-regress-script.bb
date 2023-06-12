SUMMARY = "A small script to test the nvme binary for regressions"
DESCRIPTION = "A small shell script to test the nvme binary for regressions. It requires an \
NVMe device for testing purposes. Do NOT use in a production environment."
LICENSE = "GPL-2.0-only"

PV = "2.4"

RPM_NAME = "nvme-cli-regress-script-2.4-1.1.noarch.rpm"
RPM_HASH = "e0c122c980cbee231bf6a90b5a417f64b5a1239e13c2cf34ee4a5e31e5cf40a4f8c48eae73eae5ec90e573324109c96e5f5d2d05f89d392fa0d66d77817c11fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvme-cli-regress-script"
RDEPENDS:${PN} += "/bin/bash \
nvme-cli"

inherit rpm
