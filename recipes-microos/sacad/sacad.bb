SUMMARY = "Search and download music album covers"
DESCRIPTION = "SACAD is a multi platform command line tool to download album covers \
without manual intervention, ideal for integration in scripts, audio \
players, etc."
LICENSE = "MPL-2.0"

PV = "2.7.4"

RPM_NAME = "sacad-2.7.4-1.1.noarch.rpm"
RPM_HASH = "a3f1f6bbfb4a5bf73c20f738af1daa455cacfe470f60f39b5e99f0edeaf603a8c2628db6d356ec7e8faa1399523d1f84bdf3f7b53e4e9ed93d0fc9e3a70ff674"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(sacad) python3dist(sacad) sacad"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-Pillow python3-Unidecode python3-aiohttp python3-appdirs python3-bitarray python3-cssselect python3-fake-useragent python3-lxml python3-mutagen python3-tqdm python3-web_cache"

inherit rpm
