## How to start

Execute syntax below in your PostgreSQL Editor : 
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

check uuid-ossp is already installed:
SELECT * FROM pg_extension WHERE extname = 'uuid-ossp';

SELECT uuid_generate_v4();