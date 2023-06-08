SUMMARY = "A new interface for environments in LaTeX"
DESCRIPTION = "The package provides the \\collect@body command (as in amsmath), \
as well as a \\long version \\Collect@Body, for collecting the \
body text of an environment. These commands are used to define \
a new author interface to creating new environments. For \
example, \\NewEnviron{test}, wraps the entire environment body \
in square brackets, doing the right thing in ignoring leading \
and trailing spaces."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn56615"

RPM_NAME = "texlive-environ-2023.201.0.0.3svn56615-53.1.noarch.rpm"
RPM_HASH = "c6cfd569d8b7163bcdb6a432cb04a994cdc2b56eece8a517ae833ff1fe4882761aa2026cdf6223ad1d8c64c051245cff5a0d38776d31442dec6f57e79405b04c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(environ.sty) texlive-environ"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(trimspaces.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-trimspaces"

inherit rpm
