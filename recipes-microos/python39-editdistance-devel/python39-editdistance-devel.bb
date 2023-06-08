SUMMARY = "Development files for python39-editdistance"
DESCRIPTION = "This package contains the files needed for binding the python39-editdistance C module."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-editdistance-devel-0.6.2-1.4.aarch64.rpm"
RPM_HASH = "766f7d4226aa2546a2134b4b0359e873f64dca3712320ad4e176e084827f8d44a7b029cc2584890bfc9775274480bd57845e0fb3053a0bc5d8d690dee47f001e"

RPROVIDES:${PN} += "python39-editdistance-devel python39-editdistance-devel(aarch-64)"
RDEPENDS:${PN} += "python39-base python39-editdistance"

inherit rpm
