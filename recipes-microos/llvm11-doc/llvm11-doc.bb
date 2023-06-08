SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-doc-11.0.1-12.1.noarch.rpm"
RPM_HASH = "45e0aed1779884a2c38e664ae56ea60aae78b2b30294581b8a370355571729a6eea4b09119f9fc0810b4bdb70edd6a3dd16c350f089764db0b6874710f0e7509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider llvm11-doc"
RDEPENDS:${PN} += "llvm11"

inherit rpm
