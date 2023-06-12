SUMMARY = "Python framework for Telegram Bot API"
DESCRIPTION = "Telepot helps you build applications for Telegram Bot API. It works on Python 2.7 and Python 3. It also has an async version based on asyncio and Python 3.5+."
LICENSE = "MIT"

PV = "12.7"

RPM_NAME = "python39-telepot-12.7-4.10.noarch.rpm"
RPM_HASH = "62a16b0115cfbb7e264d2cd3159aa73461901c9fedec59041cfb88907ea295ae6743a17211b09b77c27347d92a7ab01f34e6ddb9c6af148e7f2e3b5e7085a865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(telepot) \
python39-telepot \
python3dist(telepot)"
RDEPENDS:${PN} += "python(abi) \
python39-urllib3"

inherit rpm
