SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly. \
 \
This package is a dummy package that depends on the version of \
llvm-polly-devel that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "llvm-polly-devel-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "e69eaba6f41b7c4a717455417c372f865936d0e01208cc7843842ea9f79c650caad1879b93527628890ad3f0ebd770c508c7cf61d64d1e13df7edfdd293480b4"

RPROVIDES:${PN} += "llvm-polly-devel llvm-polly-devel(aarch-64)"
RDEPENDS:${PN} += "llvm-polly llvm16-polly-devel"

inherit rpm
