SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "llvm16-doc-16.0.2-1.1.noarch.rpm"
RPM_HASH = "e2456bf6c2ba51bc12ec2b0c0431639432a40e00e646867048d8e1bcdd8ec64f5e0993ca0ddb329a8de6f6fb19c8ab1734002a76e4e5599b0db04a68248cfd62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider llvm16-doc"
RDEPENDS:${PN} += "llvm16"

inherit rpm
