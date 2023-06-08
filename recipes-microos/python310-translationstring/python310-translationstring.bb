SUMMARY = "Utility library for i18n relied on by various Repoze and Pyramid packages"
DESCRIPTION = "A library used by various Pylons Project packages for internationalization \
(i18n) duties related to translation. \
 \
This package provides a translation string class, a translation string factory \
class, translation and pluralization primitives, and a utility that helps \
Chameleon templates use translation facilities of this package. It does not \
depend on Babel, but its translation and pluralization services are meant to \
work best when provided with an instance of the babel.support.Translations class."
LICENSE = "SUSE-Repoze"

PV = "1.4"

RPM_NAME = "python310-translationstring-1.4-2.12.noarch.rpm"
RPM_HASH = "7f69aae9e2f8243611c3f54685f392a9ef74016b5abb70d7cafccfd9c1f85d2396577f40a90eefe50e83b23fcb09f46702f16bd112bdbc74347418ccbcbebb6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-translationstring python3.10dist(translationstring) python310-translationstring python3dist(translationstring)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
