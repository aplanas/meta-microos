SUMMARY = "Markdown text-to-html markup system"
DESCRIPTION = "A pure-lua implementation of the Markdown text-to-html markup system."
LICENSE = "MIT"

PV = "0.331"

RPM_NAME = "lua54-markdown-0.331-4.2.noarch.rpm"
RPM_HASH = "de3828efde299ab21d9e67ce3112a22db297284b925ded295b476a663bd5cd64ad71c357586fc01cf2cea6c2acc047c85937a1abfccefe50f9c89a5693d83862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-markdown lua54-markdown"
RDEPENDS:${PN} += "lua54"

inherit rpm
