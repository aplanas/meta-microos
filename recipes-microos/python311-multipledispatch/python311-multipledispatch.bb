SUMMARY = "Multiple dispatch in Python"
DESCRIPTION = "A relatively sane approach to multiple dispatch in Python. \
 \
This implementation of multiple dispatch is mostly complete, \
performs static analysis to avoid conflicts, and provides optional namespace \
support."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python311-multipledispatch-0.6.0-2.9.noarch.rpm"
RPM_HASH = "204eb8e7db16479b635bd1b45994fb87ea7bb96f2e31a774d513f58c5b0a42d33f27efa0145937e86ce234912297bc0ae4f5e6d1f912e8750b1091566a558b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(multipledispatch) \
python311-multipledispatch \
python3dist(multipledispatch)"
RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
