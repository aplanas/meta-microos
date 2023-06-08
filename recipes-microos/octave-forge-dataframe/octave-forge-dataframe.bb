SUMMARY = "Data manipulation toolbox similar to R data.frame"
DESCRIPTION = "Data manipulation toolbox similar to R data.frame. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0+"

PV = "1.2.0"

RPM_NAME = "octave-forge-dataframe-1.2.0-1.18.noarch.rpm"
RPM_HASH = "bdf09f7dc6fbafb1df94731c8dc84762a6ee8119113d0a2bc38aeb93c615e5906a9c6c82ac41568374cbe1d9b7da62a3d95d9af5cd74884e731a17a78e8a7c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-dataframe"
RDEPENDS:${PN} += "/bin/sh octave-cli"

inherit rpm
