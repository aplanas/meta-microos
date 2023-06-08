SUMMARY = "Binary files of luaotfload"
DESCRIPTION = "Binary files of luaotfload"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34647"

RPM_NAME = "texlive-luaotfload-bin-2023.20230311.svn34647-89.1.aarch64.rpm"
RPM_HASH = "0e3ac5ac179d66168b1065d24b60aba7de636648c2794378d9b747331705c39b06c8ae1489f0a9c0f0608e05e4750eb88a185761a8565e7a28bd9a838444a7d7"

RPROVIDES:${PN} += "texlive-luaotfload-bin texlive-luaotfload-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-luaotfload"

inherit rpm
