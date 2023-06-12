SUMMARY = "Example drawings using MetaPost"
DESCRIPTION = "These are a few (hundred) example pictures drawn with MetaPost, \
ranging from very simple (lines and circles) to rather \
intricate (uncommon geometric transformations, fractals, \
bitmap, etc)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-metapost-examples-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "e8b1505b624c8de01b24bf28d28888091b0f05d2de4a29a90575c1758d07568b2ddb8be0df0b9a5deb7b472288b025a23a92bd1130ebcb8b3565d327624d54d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metapost-examples"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
