SUMMARY = "Protect and discover secrets using Gitleaks"
DESCRIPTION = "Gitleaks is a SAST tool for detecting and preventing hardcoded secrets like passwords, api keys, and tokens in git repos. Gitleaks is an easy-to-use, all-in-one solution for detecting secrets, past or present, in your code."
LICENSE = "MIT"

PV = "8.16.0"

RPM_NAME = "gitleaks-8.16.0-1.3.aarch64.rpm"
RPM_HASH = "8bf1d56dc44349cce6a24f085ad4f9e4cdd194d4665ba0e2c98238f749abeaee639fcc56ab89a0af42ab2c70d29518fc2f90591be4990c3585678ae7d5cd8766"

RPROVIDES:${PN} += "gitleaks gitleaks(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
