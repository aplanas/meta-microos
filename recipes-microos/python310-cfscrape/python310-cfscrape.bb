SUMMARY = "Python module to bypass Cloudflare's anti-bot page"
DESCRIPTION = "A simple Python module to bypass Cloudflare's anti-bot page (also known as 'I'm \
Under Attack Mode', or IUAM), implemented with Requests. \
 \
This can be useful if you wish to scrape or crawl a website protected with \
Cloudflare. Cloudflare's anti-bot page currently just checks if the client \
supports Javascript, though they may add additional techniques in the future. \
 \
Due to Cloudflare continually changing and hardening their protection page, \
cfscrape requires Node.js to solve Javascript challenges. This allows the script \
to easily impersonate a regular web browser without explicitly deobfuscating and \
parsing Cloudflare's Javascript. \
 \
Note: This only works when regular Cloudflare anti-bots is enabled (the \
'Checking your browser before accessing...' loading page). If there is a \
reCAPTCHA challenge, you're out of luck. Thankfully, the Javascript check page \
is much more common."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python310-cfscrape-2.1.1-1.14.noarch.rpm"
RPM_HASH = "0b40bea4b338d03f957c3c5d67238da7da1630e73265ad3550d5e1db6dc821b33130c138d109d17ac72ed79d2b417aa8d52c44e233fc54778e9a7dbc0256fc84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cfscrape python3.10dist(cfscrape) python310-cfscrape python3dist(cfscrape)"
RDEPENDS:${PN} += "nodejs python(abi) python310-requests"

inherit rpm
