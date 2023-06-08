SUMMARY = "A conservative interactive spell checker for source code"
DESCRIPTION = "Scspell is a spell checker for source code. This is an unofficial fork (of \
https://launchpad.net/scspell) that runs on both Python 2 and 3. \
 \
Scspell does not try to be particularly smart--rather, it does the simplest \
thing that can possibly work: \
 \
    1. All alphanumeric strings (strings of letters, numbers, and \
       underscores) are spell-checked tokens. \
    2. Each token is split into one or more subtokens. Underscores and digits \
       always divide tokens, and capital letters will begin new subtokens. In \
       other words, ``some_variable`` and ``someVariable`` will both generate \
       the subtoken list {``some``, ``variable``}. \
    3. All subtokens longer than three characters are matched against a set of \
       dictionaries, and a match failure prompts the user for action. When \
       matching against the included English dictionary, *prefix matching* is \
       employed; this choice permits the use of truncated words like ``dict`` \
       as valid subtokens. \
 \
When applied to code written in most popular programming languages while using \
typical naming conventions, this algorithm will usually catch many errors \
without an annoying false positive rate. \
 \
In an effort to catch more spelling errors, Scspell is able to check each \
file against a set of dictionary words selected *specifically for that file*. Up \
to three different sub-dictionaries may be searched for any given file: \
 \
    1. A natural language dictionary. (Scspell provides an American \
       English dictionary as the default.) \
    2. A programming language-specific dictionary, intended to contain \
       oddly-spelled keywords and APIs associated with that language. \
       (Scspell provides small default dictionaries for a number of popular \
       programming languages.) \
    3. A file-specific dictionary, intended to contain uncommon strings which \
       are not likely to be found in more than a handful of unique files."
LICENSE = "GPL-2.0-only"

PV = "2.2"

RPM_NAME = "python311-scspell3k-2.2-4.13.noarch.rpm"
RPM_HASH = "ff6f6c3841d4e08d59eb6f1e62d2bb198efa958aaf91327512c8d4b44608e3dfc1c72162d197f2762c902e53c07cb874624e2ac0eef504206d5b1c0afa445ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(scspell3k) python311-scspell3k python3dist(scspell3k)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
