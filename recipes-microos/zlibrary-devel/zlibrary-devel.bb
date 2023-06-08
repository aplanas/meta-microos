SUMMARY = "Development files for zlibrary"
DESCRIPTION = "This package contains the libraries amd header files that are needed \
for writing applications with Zlibrary."
LICENSE = "GPL-2.0+"

PV = "0.99.4"

RPM_NAME = "zlibrary-devel-0.99.4-3.27.aarch64.rpm"
RPM_HASH = "200adc52dab4be60d55047f2971f6c2b66b05ff0d4ae513770878e8c88df77fc7a83c92681dc654d814e2868d85698b3f72acb2e1fcee267d99cee864f6ccfcb"

RPROVIDES:${PN} += "zlibrary-devel zlibrary-devel(aarch-64)"
RDEPENDS:${PN} += "libzlui0_99 zlibrary0_99"

inherit rpm
