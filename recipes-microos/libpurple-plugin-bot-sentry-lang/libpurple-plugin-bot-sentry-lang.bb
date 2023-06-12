SUMMARY = "Translations for package libpurple-plugin-bot-sentry"
DESCRIPTION = "Provides translations for the 'libpurple-plugin-bot-sentry' package."
LICENSE = "GPL-2.0+"

PV = "1.3.0"

RPM_NAME = "libpurple-plugin-bot-sentry-lang-1.3.0-2.25.noarch.rpm"
RPM_HASH = "78b7479b53c0519ec72aaafb8179530af3a5f8aa9962291372c0f95da278b0b624b325d541bde32dd88d4759d4d7aa45ca4c322a894177174b8006f2259bd30a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpurple-plugin-bot-sentry-lang \
libpurple-plugin-bot-sentry-lang-all \
locale(libpurple-plugin-bot-sentry:ar) \
locale(libpurple-plugin-bot-sentry:cs) \
locale(libpurple-plugin-bot-sentry:de) \
locale(libpurple-plugin-bot-sentry:es) \
locale(libpurple-plugin-bot-sentry:it) \
locale(libpurple-plugin-bot-sentry:ru)"
RDEPENDS:${PN} += "libpurple-plugin-bot-sentry"

inherit rpm
