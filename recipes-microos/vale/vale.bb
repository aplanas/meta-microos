SUMMARY = "CLI tool to lint prose text with syntax awareneness and extensible markup format support"
DESCRIPTION = "Vale is a command-line tool that brings code-like linting to prose. It's fast, \
cross-platform (Windows, macOS, and Linux), and highly customizable. \
 \
Vale has support for markup: Vale has a rich understanding of many markup \
formats, allowing it to avoid syntax-related false positives and intelligently \
exclude code snippets from prose-related rules. \
 \
Vale includes a highly customizable extension system capable of enforcing your \
style-be it a standard editorial style guide or a custom in-house set of rules \
(such as those created by GitLab, Homebrew, Linode, CockroachDB, and Spotify). \
 \
https://vale.sh/"
LICENSE = "MIT"

PV = "2.25.2"

RPM_NAME = "vale-2.25.2-1.1.aarch64.rpm"
RPM_HASH = "0f022077c2d6508201477035b8c37eb21b56f1f359420e92249ef40e1c5a3edbbaec1b1d2667c446d01653ec51afa1b556e79e27b8e3ea060ff6c3e0f2811aed"

RPROVIDES:${PN} += "vale vale(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
