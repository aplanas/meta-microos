SUMMARY = "CLI tool and library for generating a Software Bill of Materials"
DESCRIPTION = "A CLI tool and Go library for generating a Software Bill of Materials (SBOM) from container images and filesystems. Exceptional for vulnerability detection when used with a scanner like Grype."
LICENSE = "Apache-2.0"

PV = "0.80.0"

RPM_NAME = "syft-0.80.0-1.1.aarch64.rpm"
RPM_HASH = "2e47ef1fe4a189b699a28729767ed14284b4b13fe2567a7a25edb9f954cc4209f0843ae2024ef14cf36ff7687167a7a8258ddf10b014a845104f95227b3c02e1"

RPROVIDES:${PN} += "syft syft(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
