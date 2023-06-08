SUMMARY = "SPDX Software Bill of Materials (SBOM) Generator"
DESCRIPTION = "The spdx-sbom-generator tool helps those in the community that want to \
generate SPDX Software Bill of Materials (SBOMs) with current package \
managers. \
 \
It has a command line Interface (CLI) that lets you generate SBOM \
information, including components, licenses, copyrights, and security \
references of your software using SPDX v2.2 specification and aligning \
with the current known minimum elements from NTIA. It automatically \
determines which package managers or build systems are actually being \
used by the software. \
 \
spdx-sbom-generator is supporting the following (bundling) package managers: \
 \
* GoMod (go) \
* Cargo (Rust) \
* Composer (PHP) \
* DotNet (.NET) \
* Maven (Java) \
* NPM (Node.js) \
* Yarn (Node.js) \
* PIP (Python) \
* Pipenv (Python) \
* Gems (Ruby) \
* Swift Package Manager (Swift)"
LICENSE = "Apache-2.0 & CC-BY-4.0"

PV = "0.0.13"

RPM_NAME = "spdx-sbom-generator-0.0.13-1.8.aarch64.rpm"
RPM_HASH = "40428d29dd8213f0da9bf4327608f91330b51b03b42ac51a2e83a23d8519a9d42b8b50999224ac85c517a3f8173827e8a05f1c73aeda6f294be2f0156261ae2b"

RPROVIDES:${PN} += "spdx-sbom-generator spdx-sbom-generator(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
