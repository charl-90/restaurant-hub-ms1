## Repo snapshot

- This repository is a small static website (HTML + CSS) for "Restaurants Hub | The Spoon".
- Key pages: `index.html`, `gallery.html`, `signup.html`, `aboutus.html`, `restaurantlist.html`.
- Styles and images live under `assets/css/` (styles in `assets/css/style.css`, images in `assets/css/images/`, favicon in `assets/css/images/favicon`).

## Purpose for an AI coding agent

- Be guided to make small, localized edits (content, markup, or CSS). There is no build step or server framework in the repo — changes are visible by opening the HTML files in a browser or using a local static server / Live Server extension.

## What to change and where (concrete examples)

- Update gallery content: edit `gallery.html` and add/remove images in `assets/css/images/`. Keep markup semantics and reuse CSS classes defined in `assets/css/style.css`.
- Edit signup form: `signup.html` contains the registration form markup — verify input names and patterns if adding validation. No backend is present; do not assume submission handling unless the user provides an API.
- Site-wide style change: modify `assets/css/style.css`. Avoid moving images out of `assets/css/images/` without adjusting paths in HTML.

## Project-specific patterns & quirks

- Images are stored under `assets/css/images/` (not a top-level `images/`). When updating image paths, use relative paths as used in existing pages.
- Filenames use lowercase and simple names (e.g., `gallery.html`). Follow the same naming convention for new pages.
- There is no JS app architecture or package.json; do not add Node-based build tooling unless the user requests it.

## Developer workflow (discovered from repo)

- No build step: open HTML files directly in the browser to preview changes.
- Recommended quick preview: use VS Code Live Server or open `index.html` in the browser. The repository also hosts a GitHub Pages preview at: https://charl-90.github.io/restaurant-hub-ms1/gallery.html (from README).

## Integration points & external dependencies

- External resources referenced in README: Google Fonts and Font Awesome kits. Check HTML head elements for external CDN links before modifying fonts/icons.
- There is no API or backend integration visible in the repo — treat the site as static unless the user provides additional service endpoints.

## What not to assume

- Do not assume CI/CD, automated tests, or a Node/Maven build exist. README notes testing and CI are WIP; these are not present in the codebase.
- Do not add server-side code or expect form submissions to succeed — forms are static by default.

## When merging with existing `.github/copilot-instructions.md`

- Preserve any custom sections that describe non-discoverable workflows (CI tokens, deploy scripts) — only add or update items that can be verified from the repository files.

## If you need clarification

- Ask the user whether they want a static-site enhancement (add JS, create a build pipeline) or only content/CSS changes.

---
Please review this draft and tell me if any project conventions or workflows are missing or should be emphasized (for example, preferred image sizes, target viewport breakpoints, or an intended deploy process).
