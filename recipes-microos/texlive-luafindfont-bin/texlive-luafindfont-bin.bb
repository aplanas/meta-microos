SUMMARY = "Binary files of luafindfont"
DESCRIPTION = "Binary files of luafindfont"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61207"

RPM_NAME = "texlive-luafindfont-bin-2023.20230311.svn61207-89.1.aarch64.rpm"
RPM_HASH = "fba41c8fc90f9b757e03a62679930e49812720205bf4b5638a879d295269719f0327391189f24eb3847ccd6d44a3e35bfcd69bbc8429f0e2f26b31e417c1d6d4"

RPROVIDES:${PN} += "texlive-luafindfont-bin texlive-luafindfont-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-luafindfont"

inherit rpm
