SUMMARY = "Haskell x509-validation library development files"
DESCRIPTION = "This package provides the Haskell x509-validation library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.6.12"

RPM_NAME = "ghc-x509-validation-devel-1.6.12-2.3.aarch64.rpm"
RPM_HASH = "aa1c4ebed823c66a7dfb67943827bb5c03db9b60cd12bb41ae722093f6b8a5203a7f4da761d8a557019d8e7e32cc93a0bc29606896be770bd1a356f340c25ce1"

RPROVIDES:${PN} += "ghc-devel(x509-validation-1.6.12-JQgBIAyKHQDDBxJK8FYPfO) \
ghc-x509-validation-devel \
ghc-x509-validation-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(asn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk) \
ghc-devel(asn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye) \
ghc-devel(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-devel(hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3) \
ghc-devel(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) \
ghc-devel(mtl-2.2.2) \
ghc-devel(pem-0.2.4-GVwv4fsQYoEEDbQiUNwxns) \
ghc-devel(x509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw) \
ghc-devel(x509-store-1.6.9-A3hCCAbvLt52rXl7zDFmSt) \
ghc-x509-validation"

inherit rpm
